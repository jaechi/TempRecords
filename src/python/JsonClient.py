import json
import urllib2
import random

data = {"location": "office",
         "temperature": 25}

req = urllib2.Request('http://localhost:8080/TempRecords/Temperature/')
req.add_header('Content-Type', 'application/json')

response = urllib2.urlopen(req, json.dumps(data))

print "response:", response.read()