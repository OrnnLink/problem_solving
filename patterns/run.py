import os
import shutil

patterns = {
	"creational": [
		'factory',
		'abstract factory', 
		'builder', "singleton", "prototype"
	],
	"structural": [
		"adapter", "bridge", "composite", "decorator",
		"facade", "flyweight", "proxy"
	],
	"behavioural": [
		'chain of responsibility',
		'command', 'iterator', 'composite',
		'mediator', 'memento', 'observer', 
		'state', 'strategy', 'template method',
		'visitor'
	]
}

file_to_create = [ 'info.md', 'Example.java']

for classification in patterns:
	pattern_names = patterns[classification]
	for pattern in pattern_names:
		try:
			os.makedirs(pattern)
		except FileExistsError:
			...
		for f in file_to_create:
			fd = open(f'{pattern}/{f}', 'w') 
			fd.close()
