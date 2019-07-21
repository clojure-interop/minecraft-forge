(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Straight
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Straight]))

(defn ->straight
  "Constructor.

  p-i-45620-1 - `int`
  p-i-45620-2 - `java.util.Random`
  p-i-45620-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45620-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$Straight [^Integer p-i-45620-1 ^java.util.Random p-i-45620-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45620-3 ^net.minecraft.util.EnumFacing p-i-45620-4]
    (new StructureNetherBridgePieces$Straight p-i-45620-1 p-i-45620-2 p-i-45620-3 p-i-45620-4))
  (^StructureNetherBridgePieces$Straight []
    (new StructureNetherBridgePieces$Straight )))

(defn *create-piece
  "p-175882-0 - `java.util.List`
  p-175882-1 - `java.util.Random`
  p-175882-2 - `int`
  p-175882-3 - `int`
  p-175882-4 - `int`
  p-175882-5 - `net.minecraft.util.EnumFacing`
  p-175882-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$Straight`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$Straight [^java.util.List p-175882-0 ^java.util.Random p-175882-1 ^Integer p-175882-2 ^Integer p-175882-3 ^Integer p-175882-4 ^net.minecraft.util.EnumFacing p-175882-5 ^Integer p-175882-6]
    (StructureNetherBridgePieces$Straight/createPiece p-175882-0 p-175882-1 p-175882-2 p-175882-3 p-175882-4 p-175882-5 p-175882-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureNetherBridgePieces$Straight this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$Straight this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

