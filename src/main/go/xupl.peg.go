package main

import (
	"bytes"
	"fmt"
	"os"
	"./gonode"
)

type Xupl struct {
	node.Node

	Buffer   string
	Min, Max int
	rules    [1]func() bool
}

type parseError struct {
	p *Xupl
}

func (p *Xupl) Parse() os.Error {
	if p.rules[0]() {
		return nil
	}
	return &parseError{p}
}

func (e *parseError) String() string {
	buf := new(bytes.Buffer)
	line := 1
	character := 0
	for i, c := range e.p.Buffer[0:] {
		if c == '\n' {
			line++
			character = 0
		} else {
			character++
		}
		if i == e.p.Min {
			if e.p.Min != e.p.Max {
				fmt.Fprintf(buf, "parse error after line %v character %v\n", line, character)
			} else {
				break
			}
		} else if i == e.p.Max {
			break
		}
	}
	fmt.Fprintf(buf, "parse error: unexpected ")
	if e.p.Max >= len(e.p.Buffer) {
		fmt.Fprintf(buf, "end of file found\n")
	} else {
		fmt.Fprintf(buf, "'%c' at line %v character %v\n", e.p.Buffer[e.p.Max], line, character)
	}
	return buf.String()
}
func (p *Xupl) Init() {
	var position int
	matchString := func(s string) bool {
		length := len(s)
		next := position + length
		if (next <= len(p.Buffer)) && (p.Buffer[position:next] == s) {
			position = next
			return true
		} else if position >= p.Max {
			p.Max = position
		}
		return false
	}
	p.rules = [...]func() bool{
		/* 0 xupl <- 'xupl'? */
		func() bool {
			{
				position1 := position
				if !matchString("xupl") {
					goto l1
				}
				goto l2
			l1:
				position = position1
			}
		l2:
			return true
		},
	}
}
