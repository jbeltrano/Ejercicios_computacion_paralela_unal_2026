mvn archetype:generate `
  "-DgroupId=co.edu.unal.paralela" `
  "-DartifactId=Project_0" `
  "-DarchetypeArtifactId=maven-archetype-quickstart" `
  "-DinteractiveMode=false"

cd Project_0
mvn package