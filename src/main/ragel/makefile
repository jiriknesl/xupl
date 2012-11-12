ragel = ragel
dot = dot

all: xupl #xupl.c.png
	./xupl.sh

xupl: xupl.c
xupl.c: xupl.c.rl
xupl.c.dot: xupl.c.rl
xupl.c.dot.png: xupl.c.dot

check: test
test: all

clean:             ; rm -f *.c *.dot *.png xupl

%: %.c             ; cc -o $@ $^
%: %.java          ; javac $@ $^
%.go: %.go.rl      ; go -o $@ $<

%.c: %.c.rl        ; $(ragel) -o $@ $<
%.java: %.java.rl  ; $(ragel) -J -o $@ $<
%.go: %.go.rl      ; $(ragel) -Z -G2 -o $@ $<
%.dot: %.rl        ; $(ragel) -V -p -o $@ $<

%.png: %.dot       ; $(dot) -Tpng -o $@ $<
