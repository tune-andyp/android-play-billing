#!/usr/bin/env python
"""
This script will generate the example application keys

Example: Generate the keys
    $ python keygen.py <filename>
"""
import json
import sys

if len(sys.argv) == 1:
    # Print usage...
    print "Usage: " + sys.argv[0] + " <key file>"
    sys.exit(1)

with open(sys.argv[1], 'r') as my_file:
	data = json.load(my_file)

package = data["package"]

key = package.encode('rot13').encode('base64')
print "Key Alias: SampleKey"
print "Key: " + key
