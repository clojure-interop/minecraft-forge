(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor2
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Corridor2]))

(defn ->corridor-2
  "Constructor.

  p-i-45613-1 - `int`
  p-i-45613-2 - `java.util.Random`
  p-i-45613-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45613-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$Corridor2 [^Integer p-i-45613-1 ^java.util.Random p-i-45613-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45613-3 ^net.minecraft.util.EnumFacing p-i-45613-4]
    (new StructureNetherBridgePieces$Corridor2 p-i-45613-1 p-i-45613-2 p-i-45613-3 p-i-45613-4))
  (^StructureNetherBridgePieces$Corridor2 []
    (new StructureNetherBridgePieces$Corridor2 )))

(defn *create-piece
  "p-175876-0 - `java.util.List`
  p-175876-1 - `java.util.Random`
  p-175876-2 - `int`
  p-175876-3 - `int`
  p-175876-4 - `int`
  p-175876-5 - `net.minecraft.util.EnumFacing`
  p-175876-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor2`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor2 [^java.util.List p-175876-0 ^java.util.Random p-175876-1 ^Integer p-175876-2 ^Integer p-175876-3 ^Integer p-175876-4 ^net.minecraft.util.EnumFacing p-175876-5 ^Integer p-175876-6]
    (StructureNetherBridgePieces$Corridor2/createPiece p-175876-0 p-175876-1 p-175876-2 p-175876-3 p-175876-4 p-175876-5 p-175876-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureNetherBridgePieces$Corridor2 this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$Corridor2 this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

