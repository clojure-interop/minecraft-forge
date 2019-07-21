(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$Library
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$Library]))

(defn ->library
  "Constructor.

  p-i-45578-1 - `int`
  p-i-45578-2 - `java.util.Random`
  p-i-45578-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45578-4 - `net.minecraft.util.EnumFacing`"
  (^StructureStrongholdPieces$Library [^Integer p-i-45578-1 ^java.util.Random p-i-45578-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45578-3 ^net.minecraft.util.EnumFacing p-i-45578-4]
    (new StructureStrongholdPieces$Library p-i-45578-1 p-i-45578-2 p-i-45578-3 p-i-45578-4))
  (^StructureStrongholdPieces$Library []
    (new StructureStrongholdPieces$Library )))

(defn *create-piece
  "p-175864-0 - `java.util.List`
  p-175864-1 - `java.util.Random`
  p-175864-2 - `int`
  p-175864-3 - `int`
  p-175864-4 - `int`
  p-175864-5 - `net.minecraft.util.EnumFacing`
  p-175864-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureStrongholdPieces$Library`"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$Library [^java.util.List p-175864-0 ^java.util.Random p-175864-1 ^Integer p-175864-2 ^Integer p-175864-3 ^Integer p-175864-4 ^net.minecraft.util.EnumFacing p-175864-5 ^Integer p-175864-6]
    (StructureStrongholdPieces$Library/createPiece p-175864-0 p-175864-1 p-175864-2 p-175864-3 p-175864-4 p-175864-5 p-175864-6)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureStrongholdPieces$Library this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

