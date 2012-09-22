all: gonode.6 test xupl
	@./test

xupl.go: xupl.y
	$(HOME)/Development/goll1e/goll1e xupl.y > xupl.go
  
xupl: xupl.peg.6
	6l -o $@ $<

test: test.6
	@6l -o $@ $<

%.peg.go: %.peg
	peg $^

%.6: %.go
	6g $^

clean:
	@rm -f *.6 test xupl.go *.peg.go 6.out xupl
