lex = flex

all: xupl
	./xupl.sh

xupl: xupl.c
xupl.c: xupl.c.l

check: test
test: all

clean:             ; rm -f *.c *.dot *.png xupl

%: %.c             ; cc -ll -o $@ $^
%.c: %.c.l         ; $(lex) -o $@ $<
