(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor5
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Corridor5]))

(defn ->corridor-5
  "Constructor.

  p-i-45614-1 - `int`
  p-i-45614-2 - `java.util.Random`
  p-i-45614-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45614-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$Corridor5 [^Integer p-i-45614-1 ^java.util.Random p-i-45614-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45614-3 ^net.minecraft.util.EnumFacing p-i-45614-4]
    (new StructureNetherBridgePieces$Corridor5 p-i-45614-1 p-i-45614-2 p-i-45614-3 p-i-45614-4))
  (^StructureNetherBridgePieces$Corridor5 []
    (new StructureNetherBridgePieces$Corridor5 )))

(defn *create-piece
  "p-175877-0 - `java.util.List`
  p-175877-1 - `java.util.Random`
  p-175877-2 - `int`
  p-175877-3 - `int`
  p-175877-4 - `int`
  p-175877-5 - `net.minecraft.util.EnumFacing`
  p-175877-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor5`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor5 [^java.util.List p-175877-0 ^java.util.Random p-175877-1 ^Integer p-175877-2 ^Integer p-175877-3 ^Integer p-175877-4 ^net.minecraft.util.EnumFacing p-175877-5 ^Integer p-175877-6]
    (StructureNetherBridgePieces$Corridor5/createPiece p-175877-0 p-175877-1 p-175877-2 p-175877-3 p-175877-4 p-175877-5 p-175877-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureNetherBridgePieces$Corridor5 this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$Corridor5 this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

