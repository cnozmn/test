from pes.api.PESImpl import PESImpl
pesImpl = PESImpl("admin", "spss", "localhost", "8080")
critDict = {'label':'Production','keyword':'Quarterly'}
sResults = pesImpl.advanceSearch(critDict)
sRows = sResults.getRows()
for sRow in sRows:
   print "Author: ", sRow.getAuthor()
   print "Title: ", sRow.getTitle()
   for child in sRow.getChildRow():
      print "Version: ", child.getVersionMarker()
      print "Label: ", child.getVersionLabel()
      print "Keywords:", child.getKeyword()      
      print "URI:", child.getUri()
   test4detection.hexaware.com
   pass:0000000
   testAPI-KEY:"c2d3b866-fb92-485e-b1d0-28a0c17ab9a2"
