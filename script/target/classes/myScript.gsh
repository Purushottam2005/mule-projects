println "Reading script from file"

def dirName = "/Users/Reuter/tmp/pictures"
def p =  ~/.*\.jpg/
new File(dirName).eachFileMatch(p) {  
	file -> 
	println "File name : " + file.name
	def newName = "infocom.jpg"
	File f = new File(dirName + "/" + newName) 
	file.renameTo(f)
	println file.name + "->" + f.name
}