`SupportMapFragment` leak POC
===================================================================================

This repository is a Proof-of-concept that `SupportMapFragment.setRetainInstance(true)`
will always enable an Activity memory leak after rotating the device.

The implementation to get a map on screen is as simple as possible.


 ![Leak Analysis](https://i.imgur.com/ewKu6DY.png)

Usage
=====

In `gradle.properties`, add your maps API key.

If you need one, go [here](https://console.developers.google.com) to acquire one.

Proof-of-concept
================

Simply run the app and run collect a dump of the Java heap.
Observe that there is only one `MainActivity` in memory.

Rotate the device and re-run the dump of the heap.
Observe that there are now two `MainActivity` in memory.

Rotate the device multiple times and and re-run the dump of the heap.
Observe that there are still two `MainActivity` in memory, the newest and the oldest.