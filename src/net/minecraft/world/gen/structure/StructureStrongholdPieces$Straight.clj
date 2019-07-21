(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$Straight
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$Straight]))

(defn ->straight
  "Constructor.

  p-i-45573-1 - `int`
  p-i-45573-2 - `java.util.Random`
  p-i-45573-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45573-4 - `net.minecraft.util.EnumFacing`"
  (^StructureStrongholdPieces$Straight [^Integer p-i-45573-1 ^java.util.Random p-i-45573-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45573-3 ^net.minecraft.util.EnumFacing p-i-45573-4]
    (new StructureStrongholdPieces$Straight p-i-45573-1 p-i-45573-2 p-i-45573-3 p-i-45573-4))
  (^StructureStrongholdPieces$Straight []
    (new StructureStrongholdPieces$Straight )))

(defn *create-piece
  "p-175862-0 - `java.util.List`
  p-175862-1 - `java.util.Random`
  p-175862-2 - `int`
  p-175862-3 - `int`
  p-175862-4 - `int`
  p-175862-5 - `net.minecraft.util.EnumFacing`
  p-175862-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureStrongholdPieces$Straight`"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$Straight [^java.util.List p-175862-0 ^java.util.Random p-175862-1 ^Integer p-175862-2 ^Integer p-175862-3 ^Integer p-175862-4 ^net.minecraft.util.EnumFacing p-175862-5 ^Integer p-175862-6]
    (StructureStrongholdPieces$Straight/createPiece p-175862-0 p-175862-1 p-175862-2 p-175862-3 p-175862-4 p-175862-5 p-175862-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureStrongholdPieces$Straight this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureStrongholdPieces$Straight this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

