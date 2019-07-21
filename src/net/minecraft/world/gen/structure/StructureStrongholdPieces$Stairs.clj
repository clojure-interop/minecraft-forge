(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$Stairs
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$Stairs]))

(defn ->stairs
  "Constructor.

  p-i-2081-1 - `int`
  p-i-2081-2 - `java.util.Random`
  p-i-2081-3 - `int`
  p-i-2081-4 - `int`"
  (^StructureStrongholdPieces$Stairs [^Integer p-i-2081-1 ^java.util.Random p-i-2081-2 ^Integer p-i-2081-3 ^Integer p-i-2081-4]
    (new StructureStrongholdPieces$Stairs p-i-2081-1 p-i-2081-2 p-i-2081-3 p-i-2081-4))
  (^StructureStrongholdPieces$Stairs []
    (new StructureStrongholdPieces$Stairs )))

(defn *create-piece
  "p-175863-0 - `java.util.List`
  p-175863-1 - `java.util.Random`
  p-175863-2 - `int`
  p-175863-3 - `int`
  p-175863-4 - `int`
  p-175863-5 - `net.minecraft.util.EnumFacing`
  p-175863-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureStrongholdPieces$Stairs`"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$Stairs [^java.util.List p-175863-0 ^java.util.Random p-175863-1 ^Integer p-175863-2 ^Integer p-175863-3 ^Integer p-175863-4 ^net.minecraft.util.EnumFacing p-175863-5 ^Integer p-175863-6]
    (StructureStrongholdPieces$Stairs/createPiece p-175863-0 p-175863-1 p-175863-2 p-175863-3 p-175863-4 p-175863-5 p-175863-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureStrongholdPieces$Stairs this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureStrongholdPieces$Stairs this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

