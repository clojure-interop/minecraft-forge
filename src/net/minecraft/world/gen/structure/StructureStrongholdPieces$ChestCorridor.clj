(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$ChestCorridor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$ChestCorridor]))

(defn ->chest-corridor
  "Constructor.

  p-i-45582-1 - `int`
  p-i-45582-2 - `java.util.Random`
  p-i-45582-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45582-4 - `net.minecraft.util.EnumFacing`"
  (^StructureStrongholdPieces$ChestCorridor [^Integer p-i-45582-1 ^java.util.Random p-i-45582-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45582-3 ^net.minecraft.util.EnumFacing p-i-45582-4]
    (new StructureStrongholdPieces$ChestCorridor p-i-45582-1 p-i-45582-2 p-i-45582-3 p-i-45582-4))
  (^StructureStrongholdPieces$ChestCorridor []
    (new StructureStrongholdPieces$ChestCorridor )))

(defn *create-piece
  "p-175868-0 - `java.util.List`
  p-175868-1 - `java.util.Random`
  p-175868-2 - `int`
  p-175868-3 - `int`
  p-175868-4 - `int`
  p-175868-5 - `net.minecraft.util.EnumFacing`
  p-175868-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureStrongholdPieces$ChestCorridor`"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$ChestCorridor [^java.util.List p-175868-0 ^java.util.Random p-175868-1 ^Integer p-175868-2 ^Integer p-175868-3 ^Integer p-175868-4 ^net.minecraft.util.EnumFacing p-175868-5 ^Integer p-175868-6]
    (StructureStrongholdPieces$ChestCorridor/createPiece p-175868-0 p-175868-1 p-175868-2 p-175868-3 p-175868-4 p-175868-5 p-175868-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureStrongholdPieces$ChestCorridor this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureStrongholdPieces$ChestCorridor this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

