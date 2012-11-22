
#line 1 "xupl.c.rl"
#include <stdio.h>
#include <string.h>


#line 8 "xupl.c"
static const char _xupl_actions[] = {
	0, 1, 0, 1, 1
};

static const char _xupl_key_offsets[] = {
	0, 0, 1, 2, 3, 4, 5, 9, 
	12, 16
};

static const char _xupl_trans_keys[] = {
	120, 109, 108, 65, 88, 32, 63, 9, 
	13, 32, 9, 13, 32, 65, 9, 13, 
	88, 0
};

static const char _xupl_single_lengths[] = {
	0, 1, 1, 1, 1, 1, 2, 1, 
	2, 1
};

static const char _xupl_range_lengths[] = {
	0, 0, 0, 0, 0, 0, 1, 1, 
	1, 0
};

static const char _xupl_index_offsets[] = {
	0, 0, 2, 4, 6, 8, 10, 14, 
	17, 21
};

static const char _xupl_indicies[] = {
	0, 1, 2, 1, 3, 1, 4, 1, 
	5, 1, 6, 7, 6, 1, 6, 6, 
	1, 6, 4, 6, 1, 5, 1, 0
};

static const char _xupl_trans_targs[] = {
	2, 0, 3, 4, 8, 9, 7, 1
};

static const char _xupl_trans_actions[] = {
	0, 0, 0, 0, 0, 0, 0, 0
};

static const char _xupl_eof_actions[] = {
	0, 0, 0, 0, 0, 0, 3, 3, 
	3, 1
};

static const int xupl_start = 6;
static const int xupl_first_final = 6;
static const int xupl_error = 0;

static const int xupl_en_doctype = 5;
static const int xupl_en_main = 6;


#line 7 "xupl.c.rl"


unsigned char xupl( const char *str )
{
  const char *p = str, *pe = str + strlen( str ) - 1; //-1 to strip "\n"
  const char *eof = pe;
  int cs;

  unsigned char correct = 0;

  
#line 78 "xupl.c"
	{
	cs = xupl_start;
	}

#line 83 "xupl.c"
	{
	int _klen;
	unsigned int _trans;
	const char *_keys;

	if ( p == pe )
		goto _test_eof;
	if ( cs == 0 )
		goto _out;
_resume:
	_keys = _xupl_trans_keys + _xupl_key_offsets[cs];
	_trans = _xupl_index_offsets[cs];

	_klen = _xupl_single_lengths[cs];
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

	_klen = _xupl_range_lengths[cs];
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
	_trans = _xupl_indicies[_trans];
	cs = _xupl_trans_targs[_trans];

	if ( cs == 0 )
		goto _out;
	if ( ++p != pe )
		goto _resume;
	_test_eof: {}
	if ( p == eof )
	{
	const char *__acts = _xupl_actions + _xupl_eof_actions[cs];
	unsigned int __nacts = (unsigned int) *__acts++;
	while ( __nacts-- > 0 ) {
		switch ( *__acts++ ) {
	case 0:
#line 18 "xupl.c.rl"
	{ printf("match\n"); }
	break;
	case 1:
#line 19 "xupl.c.rl"
	{ printf("doctype\n"); cs = 5;  }
	break;
#line 165 "xupl.c"
		}
	}
	}

	_out: {}
	}

#line 49 "xupl.c.rl"

  
  return correct;
}

#define BUFSIZE 1024
int main()
{
  char buf[BUFSIZE];
  while ( fgets( buf, sizeof(buf), stdin ) != 0 && xupl( buf ) == 0);
  return 0;
}
