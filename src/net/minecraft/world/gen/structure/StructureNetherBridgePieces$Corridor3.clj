(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor3
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Corridor3]))

(defn ->corridor-3
  "Constructor.

  p-i-45619-1 - `int`
  p-i-45619-2 - `java.util.Random`
  p-i-45619-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45619-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$Corridor3 [^Integer p-i-45619-1 ^java.util.Random p-i-45619-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45619-3 ^net.minecraft.util.EnumFacing p-i-45619-4]
    (new StructureNetherBridgePieces$Corridor3 p-i-45619-1 p-i-45619-2 p-i-45619-3 p-i-45619-4))
  (^StructureNetherBridgePieces$Corridor3 []
    (new StructureNetherBridgePieces$Corridor3 )))

(defn *create-piece
  "p-175883-0 - `java.util.List`
  p-175883-1 - `java.util.Random`
  p-175883-2 - `int`
  p-175883-3 - `int`
  p-175883-4 - `int`
  p-175883-5 - `net.minecraft.util.EnumFacing`
  p-175883-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor3`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor3 [^java.util.List p-175883-0 ^java.util.Random p-175883-1 ^Integer p-175883-2 ^Integer p-175883-3 ^Integer p-175883-4 ^net.minecraft.util.EnumFacing p-175883-5 ^Integer p-175883-6]
    (StructureNetherBridgePieces$Corridor3/createPiece p-175883-0 p-175883-1 p-175883-2 p-175883-3 p-175883-4 p-175883-5 p-175883-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureNetherBridgePieces$Corridor3 this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$Corridor3 this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

