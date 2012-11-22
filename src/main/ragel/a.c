
#line 1 "a.c.rl"
#include <stdio.h>
#include <string.h>


#line 8 "a.c"
static const char _checker_actions[] = {
	0, 1, 0, 1, 1
};

static const char _checker_key_offsets[] = {
	0, 0, 5, 10, 15, 22, 25, 27, 
	32, 34
};

static const char _checker_trans_keys[] = {
	95, 65, 90, 97, 122, 95, 65, 90, 
	97, 122, 32, 58, 123, 9, 13, 95, 
	48, 57, 65, 90, 97, 122, 32, 9, 
	13, 48, 57, 32, 58, 123, 9, 13, 
	48, 57, 32, 9, 13, 48, 57, 0
};

static const char _checker_single_lengths[] = {
	0, 1, 1, 3, 1, 1, 0, 3, 
	0, 1
};

static const char _checker_range_lengths[] = {
	0, 2, 2, 1, 3, 1, 1, 1, 
	1, 2
};

static const char _checker_index_offsets[] = {
	0, 0, 4, 8, 13, 18, 21, 23, 
	28, 30
};

static const char _checker_indicies[] = {
	0, 0, 0, 1, 2, 2, 2, 1, 
	3, 1, 1, 3, 2, 1, 5, 1, 
	1, 4, 6, 6, 1, 7, 1, 1, 
	1, 1, 1, 0, 7, 1, 6, 6, 
	7, 1, 0
};

static const char _checker_trans_targs[] = {
	7, 0, 3, 4, 5, 9, 6, 8
};

static const char _checker_trans_actions[] = {
	0, 0, 0, 0, 0, 0, 0, 0
};

static const char _checker_eof_actions[] = {
	0, 0, 0, 0, 0, 0, 0, 1, 
	3, 3
};

static const int checker_start = 1;
static const int checker_first_final = 7;
static const int checker_error = 0;

static const int checker_en_attr = 2;
static const int checker_en_main = 1;


#line 7 "a.c.rl"


unsigned char checker( const char *str )
{
  /* standart Ragel variables */
  const char *p = str, *pe = str + strlen( str ) - 1; //-1 to strip "\n"
  const char *eof = pe;
  int cs;

  unsigned char correct = 0;

  
#line 83 "a.c"
	{
	cs = checker_start;
	}

#line 88 "a.c"
	{
	int _klen;
	unsigned int _trans;
	const char *_keys;

	if ( p == pe )
		goto _test_eof;
	if ( cs == 0 )
		goto _out;
_resume:
	_keys = _checker_trans_keys + _checker_key_offsets[cs];
	_trans = _checker_index_offsets[cs];

	_klen = _checker_single_lengths[cs];
	if ( _klen > 0 ) {
		const char *_lower = _keys;
		const char *_mid;
		const char *_upper = _keys + _klen - 1;
		while (1) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( (*p) < *_mid )
				_upper = _mid - 1;
			else if ( (*p) > *_mid )
				_lower = _mid + 1;
			else {
				_trans += (unsigned int)(_mid - _keys);
				goto _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _checker_range_lengths[cs];
	if ( _klen > 0 ) {
		const char *_lower = _keys;
		const char *_mid;
		const char *_upper = _keys + (_klen<<1) - 2;
		while (1) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( (*p) < _mid[0] )
				_upper = _mid - 2;
			else if ( (*p) > _mid[1] )
				_lower = _mid + 2;
			else {
				_trans += (unsigned int)((_mid - _keys)>>1);
				goto _match;
			}
		}
		_trans += _klen;
	}

_match:
	_trans = _checker_indicies[_trans];
	cs = _checker_trans_targs[_trans];

_again:
	if ( cs == 0 )
		goto _out;
	if ( ++p != pe )
		goto _resume;
	_test_eof: {}
	if ( p == eof )
	{
	const char *__acts = _checker_actions + _checker_eof_actions[cs];
	unsigned int __nacts = (unsigned int) *__acts++;
	while ( __nacts-- > 0 ) {
		switch ( *__acts++ ) {
	case 0:
#line 19 "a.c.rl"
	{ printf("push "); }
	break;
	case 1:
#line 21 "a.c.rl"
	{ printf("attr "); {cs = 2; goto _again;} }
	break;
#line 171 "a.c"
		}
	}
	}

	_out: {}
	}

#line 31 "a.c.rl"

  
  return correct;
};


#define BUFSIZE 1024
int main()
{
  char buf[BUFSIZE];
  while ( fgets( buf, sizeof(buf), stdin ) != 0 ) {
    printf( "%d\n", checker( buf ));
  }
  return 0;
}
