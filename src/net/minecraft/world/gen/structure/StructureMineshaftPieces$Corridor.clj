(ns net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureMineshaftPieces$Corridor]))

(defn ->corridor
  "Constructor.

  p-i-47140-1 - `int`
  p-i-47140-2 - `java.util.Random`
  p-i-47140-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-47140-4 - `net.minecraft.util.EnumFacing`
  p-i-47140-5 - `net.minecraft.world.gen.structure.MapGenMineshaft$Type`"
  (^StructureMineshaftPieces$Corridor [^Integer p-i-47140-1 ^java.util.Random p-i-47140-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-47140-3 ^net.minecraft.util.EnumFacing p-i-47140-4 ^net.minecraft.world.gen.structure.MapGenMineshaft$Type p-i-47140-5]
    (new StructureMineshaftPieces$Corridor p-i-47140-1 p-i-47140-2 p-i-47140-3 p-i-47140-4 p-i-47140-5))
  (^StructureMineshaftPieces$Corridor []
    (new StructureMineshaftPieces$Corridor )))

(defn *find-corridor-size
  "p-175814-0 - `java.util.List`
  rand - `java.util.Random`
  x - `int`
  y - `int`
  z - `int`
  facing - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.world.gen.structure.StructureBoundingBox`"
  (^net.minecraft.world.gen.structure.StructureBoundingBox [^java.util.List p-175814-0 ^java.util.Random rand ^Integer x ^Integer y ^Integer z ^net.minecraft.util.EnumFacing facing]
    (StructureMineshaftPieces$Corridor/findCorridorSize p-175814-0 rand x y z facing)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureMineshaftPieces$Corridor this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureMineshaftPieces$Corridor this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

