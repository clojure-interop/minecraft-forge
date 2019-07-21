(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$RoomCrossing
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$RoomCrossing]))

(defn ->room-crossing
  "Constructor.

  p-i-45575-1 - `int`
  p-i-45575-2 - `java.util.Random`
  p-i-45575-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45575-4 - `net.minecraft.util.EnumFacing`"
  (^StructureStrongholdPieces$RoomCrossing [^Integer p-i-45575-1 ^java.util.Random p-i-45575-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45575-3 ^net.minecraft.util.EnumFacing p-i-45575-4]
    (new StructureStrongholdPieces$RoomCrossing p-i-45575-1 p-i-45575-2 p-i-45575-3 p-i-45575-4))
  (^StructureStrongholdPieces$RoomCrossing []
    (new StructureStrongholdPieces$RoomCrossing )))

(defn *create-piece
  "p-175859-0 - `java.util.List`
  p-175859-1 - `java.util.Random`
  p-175859-2 - `int`
  p-175859-3 - `int`
  p-175859-4 - `int`
  p-175859-5 - `net.minecraft.util.EnumFacing`
  p-175859-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureStrongholdPieces$RoomCrossing`"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$RoomCrossing [^java.util.List p-175859-0 ^java.util.Random p-175859-1 ^Integer p-175859-2 ^Integer p-175859-3 ^Integer p-175859-4 ^net.minecraft.util.EnumFacing p-175859-5 ^Integer p-175859-6]
    (StructureStrongholdPieces$RoomCrossing/createPiece p-175859-0 p-175859-1 p-175859-2 p-175859-3 p-175859-4 p-175859-5 p-175859-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureStrongholdPieces$RoomCrossing this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureStrongholdPieces$RoomCrossing this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

