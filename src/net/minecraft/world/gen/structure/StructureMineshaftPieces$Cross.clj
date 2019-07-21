(ns net.minecraft.world.gen.structure.StructureMineshaftPieces$Cross
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureMineshaftPieces$Cross]))

(defn ->cross
  "Constructor.

  p-i-47139-1 - `int`
  p-i-47139-2 - `java.util.Random`
  p-i-47139-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-47139-4 - `net.minecraft.util.EnumFacing`
  p-i-47139-5 - `net.minecraft.world.gen.structure.MapGenMineshaft$Type`"
  (^StructureMineshaftPieces$Cross [^Integer p-i-47139-1 ^java.util.Random p-i-47139-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-47139-3 ^net.minecraft.util.EnumFacing p-i-47139-4 ^net.minecraft.world.gen.structure.MapGenMineshaft$Type p-i-47139-5]
    (new StructureMineshaftPieces$Cross p-i-47139-1 p-i-47139-2 p-i-47139-3 p-i-47139-4 p-i-47139-5))
  (^StructureMineshaftPieces$Cross []
    (new StructureMineshaftPieces$Cross )))

(defn *find-crossing
  "list-in - `java.util.List`
  rand - `java.util.Random`
  x - `int`
  y - `int`
  z - `int`
  facing - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.world.gen.structure.StructureBoundingBox`"
  (^net.minecraft.world.gen.structure.StructureBoundingBox [^java.util.List list-in ^java.util.Random rand ^Integer x ^Integer y ^Integer z ^net.minecraft.util.EnumFacing facing]
    (StructureMineshaftPieces$Cross/findCrossing list-in rand x y z facing)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureMineshaftPieces$Cross this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureMineshaftPieces$Cross this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

