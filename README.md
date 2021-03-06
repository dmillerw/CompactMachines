Compact Machines
================

Adds one simple game mechanic: Small rooms inside of blocks.
It basically gives you the ability to build your contraptions inside of a single block.

Each side of a Compact Machine has a small buffer for items, fluids and Redstone Flux
allowing the room to interact with the outside. Applied Energistics channels are
supported as well. The room has the corresponding counter parts on its walls.


Your first room
===============

* Craft yourself a compact machine
* Right click it with a "Personal Shrinking Device"
* Use the interfaces in the walls to access the buffers
* Right click again to leave the block.


State of the mod
================

It is experimental and might screw your worlds, though it is unlikely. I might also add
some world breaking stuff later on, but you will be warned if that should happen. Also
unlikely though.
This mod is in a very very early stage and I expect a few bugs here and there, feedback is
much appreciated on the GitHub issue tracker. As are pull requests obviously :)

For now this mod is feature complete and I do not really plan on adding more stuff. But I
might be adding some machinery you need to use to be able to craft these rooms. Just being
able to craft these things directly seems like a bit of a waste. Textures/Names might get
an overhaul soon.


Blocks and Items
================

Compact Machines, 6 sizes
--------------------------
Surround a World Resizing Cube with one of the following materials:

* Wood gives you a 3x3x3 room
* Iron, 5x5x5
* Gold, 7x7x7
* Obsidian, 9x9x9
* Diamond, 11x11x11
* Nether Star, 13x13x13

![](/readme-images/compact_machine.png)


Personal Shrinking Device
-------------------------
Required to enter/leave a block. Don't lose yours while you are working inside of a
machine or you might get trapped.

![](/readme-images/personal_shrinking_device.png)


Stuff only required for crafting
--------------------------------
You only need these to craft the two things above.

* World Resizing Interface

![](/readme-images/world_resizing_interface.png)

* World Resizing Cube

![](/readme-images/world_resizing_cube.png)

* Atom Shrinking Module

![](/readme-images/atom_shrinking_module.png)

* Atom Enlarging Module

![](/readme-images/atom_enlarging_module.png)



Credits
=======

This mod would not have been possible without the following open source mods:

* [Enderstorage](https://github.com/Chicken-Bones/EnderStorage) (helped with inventory + fluid handling across dimensions)
* [CodeChickenCore/Lib](https://github.com/Chicken-Bones?tab=repositories) (helped with Inventory, Fluid utils, Chunkloading)
* [Minefactory Reloaded](https://github.com/skyboy/MineFactoryReloaded/) (helped with drawing tanks+energy on GUIs)
* [Random Things](https://github.com/lumien231/Random-Things/) (helped with dimension handling)
* [EquivalentExchange](https://github.com/pahimar/Equivalent-Exchange-3/) + LetsModReboot (how to get started)

All of these mods provided code for certain features or at least ideas on how to tackle
some implementations. Again, this mod would not have been possible without the fantastic
work of their authors. Thank you guys a lot.