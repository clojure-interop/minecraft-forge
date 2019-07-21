(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$LeftTurn
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$LeftTurn]))

(defn ->left-turn
  "Constructor.

  p-i-45579-1 - `int`
  p-i-45579-2 - `java.util.Random`
  p-i-45579-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45579-4 - `net.minecraft.util.EnumFacing`"
  (^StructureStrongholdPieces$LeftTurn [^Integer p-i-45579-1 ^java.util.Random p-i-45579-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45579-3 ^net.minecraft.util.EnumFacing p-i-45579-4]
    (new StructureStrongholdPieces$LeftTurn p-i-45579-1 p-i-45579-2 p-i-45579-3 p-i-45579-4))
  (^StructureStrongholdPieces$LeftTurn []
    (new StructureStrongholdPieces$LeftTurn )))

(defn *create-piece
  "p-175867-0 - `java.util.List`
  p-175867-1 - `java.util.Random`
  p-175867-2 - `int`
  p-175867-3 - `int`
  p-175867-4 - `int`
  p-175867-5 - `net.minecraft.util.EnumFacing`
  p-175867-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureStrongholdPieces$LeftTurn`"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$LeftTurn [^java.util.List p-175867-0 ^java.util.Random p-175867-1 ^Integer p-175867-2 ^Integer p-175867-3 ^Integer p-175867-4 ^net.minecraft.util.EnumFacing p-175867-5 ^Integer p-175867-6]
    (StructureStrongholdPieces$LeftTurn/createPiece p-175867-0 p-175867-1 p-175867-2 p-175867-3 p-175867-4 p-175867-5 p-175867-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureStrongholdPieces$LeftTurn this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureStrongholdPieces$LeftTurn this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

