from pes.api.PESImpl import PESImpl
pesImpl = PESImpl("admin", "spss", "localhost", "8080")
critDict = {'uri': 'spsscr:///?id=a010a37ba5992bb00000127b0f952f945be'}
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
  testfordetectiontest4detection.hexaware.com
  test4detection.hexaware.test
  API-KEY:"54b2097b-28eb-423f-912d-0838a8d620f8"
  password: test12344555
  
