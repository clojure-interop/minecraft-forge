(ns net.minecraft.world.gen.structure.StructureMineshaftPieces$Room
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureMineshaftPieces$Room]))

(defn ->room
  "Constructor.

  p-i-47137-1 - `int`
  p-i-47137-2 - `java.util.Random`
  p-i-47137-3 - `int`
  p-i-47137-4 - `int`
  p-i-47137-5 - `net.minecraft.world.gen.structure.MapGenMineshaft$Type`"
  (^StructureMineshaftPieces$Room [^Integer p-i-47137-1 ^java.util.Random p-i-47137-2 ^Integer p-i-47137-3 ^Integer p-i-47137-4 ^net.minecraft.world.gen.structure.MapGenMineshaft$Type p-i-47137-5]
    (new StructureMineshaftPieces$Room p-i-47137-1 p-i-47137-2 p-i-47137-3 p-i-47137-4 p-i-47137-5))
  (^StructureMineshaftPieces$Room []
    (new StructureMineshaftPieces$Room )))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureMineshaftPieces$Room this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureMineshaftPieces$Room this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

(defn offset
  "x - `int`
  y - `int`
  z - `int`"
  ([^StructureMineshaftPieces$Room this ^Integer x ^Integer y ^Integer z]
    (-> this (.offset x y z))))

