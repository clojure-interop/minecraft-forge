(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$Corridor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$Corridor]))

(defn ->corridor
  "Constructor.

  p-i-45581-1 - `int`
  p-i-45581-2 - `java.util.Random`
  p-i-45581-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45581-4 - `net.minecraft.util.EnumFacing`"
  (^StructureStrongholdPieces$Corridor [^Integer p-i-45581-1 ^java.util.Random p-i-45581-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45581-3 ^net.minecraft.util.EnumFacing p-i-45581-4]
    (new StructureStrongholdPieces$Corridor p-i-45581-1 p-i-45581-2 p-i-45581-3 p-i-45581-4))
  (^StructureStrongholdPieces$Corridor []
    (new StructureStrongholdPieces$Corridor )))

(defn *find-piece-box
  "p-175869-0 - `java.util.List`
  p-175869-1 - `java.util.Random`
  p-175869-2 - `int`
  p-175869-3 - `int`
  p-175869-4 - `int`
  p-175869-5 - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.world.gen.structure.StructureBoundingBox`"
  (^net.minecraft.world.gen.structure.StructureBoundingBox [^java.util.List p-175869-0 ^java.util.Random p-175869-1 ^Integer p-175869-2 ^Integer p-175869-3 ^Integer p-175869-4 ^net.minecraft.util.EnumFacing p-175869-5]
    (StructureStrongholdPieces$Corridor/findPieceBox p-175869-0 p-175869-1 p-175869-2 p-175869-3 p-175869-4 p-175869-5)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureStrongholdPieces$Corridor this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

