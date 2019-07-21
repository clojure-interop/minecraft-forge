(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$StairsStraight
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$StairsStraight]))

(defn ->stairs-straight
  "Constructor.

  p-i-45572-1 - `int`
  p-i-45572-2 - `java.util.Random`
  p-i-45572-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45572-4 - `net.minecraft.util.EnumFacing`"
  (^StructureStrongholdPieces$StairsStraight [^Integer p-i-45572-1 ^java.util.Random p-i-45572-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45572-3 ^net.minecraft.util.EnumFacing p-i-45572-4]
    (new StructureStrongholdPieces$StairsStraight p-i-45572-1 p-i-45572-2 p-i-45572-3 p-i-45572-4))
  (^StructureStrongholdPieces$StairsStraight []
    (new StructureStrongholdPieces$StairsStraight )))

(defn *create-piece
  "p-175861-0 - `java.util.List`
  p-175861-1 - `java.util.Random`
  p-175861-2 - `int`
  p-175861-3 - `int`
  p-175861-4 - `int`
  p-175861-5 - `net.minecraft.util.EnumFacing`
  p-175861-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureStrongholdPieces$StairsStraight`"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$StairsStraight [^java.util.List p-175861-0 ^java.util.Random p-175861-1 ^Integer p-175861-2 ^Integer p-175861-3 ^Integer p-175861-4 ^net.minecraft.util.EnumFacing p-175861-5 ^Integer p-175861-6]
    (StructureStrongholdPieces$StairsStraight/createPiece p-175861-0 p-175861-1 p-175861-2 p-175861-3 p-175861-4 p-175861-5 p-175861-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureStrongholdPieces$StairsStraight this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureStrongholdPieces$StairsStraight this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

