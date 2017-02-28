# DominoRED
## Hackathon2017-P5

Integrate NodeRED and Domino so NodeRED can be called from Domino XPages applications and NodeRED can use Domino to store and retrieve data. Building some sample apps around that capability. One part will be an DOTS/OSGi task kicking off NodeRED on changes in Domino. The other a set of NodeRED nodes representing Domino.

This repository contains the Domino Plug-in project for DominoRED. There are more repositories contributing to this solution:

- [Domino Connectors to DAS](https://github.com/chemp7/node-red-contrib-domino-rest) by [Takeshi Yoshida](https://github.com/chemp7)
- [NodeRED subscriber node](https://github.com/benkroeger/node-red-contrib-domino-subscriber) by [Benjamin Kröger](https://github.com/benkroeger/)

This repository contains a mavenized plug-in project that makes use of the [OpenNTF Domino API](https://www.openntf.org/main.nsf/project.xsp?r=project/OpenNTF%20Domino%20API)
