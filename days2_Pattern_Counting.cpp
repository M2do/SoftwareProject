#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <iomanip>
using namespace std;
int patternCount(string s)
{
	int len = s.length();
	vector<char> v;
	int count = 0;
	for(int i=0; i<len; i++)
	{
		if(s[i] == '0')
		{
			if(v.size() != 0)
			{
				v.push_back(s[i]);
			}
		}
		else if(s[i] == '1')
		{
			if(v.size() != 0)
			{
				if(v.back() == '1')
				{
					v.clear();
					v.push_back(s[i]);
				}
				else
				{
					count++;
					v.clear();
					v.push_back(s[i]);
				}
				
			}
			else
			{
				v.push_back(s[i]);
			}
		}
		else
		{
			v.clear();
		}
	}
	return count;
}
int main()
{
	int t;
	cin >> t;
	for(int i = 0; i < t; i++)
	{
		string s;
		cin >> s;
		int result = patternCount(s);
		cout << result << endl;
	}
	return 0;
}