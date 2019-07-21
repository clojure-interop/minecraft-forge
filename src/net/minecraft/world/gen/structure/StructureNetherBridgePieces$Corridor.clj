(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Corridor]))

(defn ->corridor
  "Constructor.

  p-i-45615-1 - `int`
  p-i-45615-2 - `java.util.Random`
  p-i-45615-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45615-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$Corridor [^Integer p-i-45615-1 ^java.util.Random p-i-45615-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45615-3 ^net.minecraft.util.EnumFacing p-i-45615-4]
    (new StructureNetherBridgePieces$Corridor p-i-45615-1 p-i-45615-2 p-i-45615-3 p-i-45615-4))
  (^StructureNetherBridgePieces$Corridor []
    (new StructureNetherBridgePieces$Corridor )))

(defn *create-piece
  "p-175879-0 - `java.util.List`
  p-175879-1 - `java.util.Random`
  p-175879-2 - `int`
  p-175879-3 - `int`
  p-175879-4 - `int`
  p-175879-5 - `net.minecraft.util.EnumFacing`
  p-175879-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor [^java.util.List p-175879-0 ^java.util.Random p-175879-1 ^Integer p-175879-2 ^Integer p-175879-3 ^Integer p-175879-4 ^net.minecraft.util.EnumFacing p-175879-5 ^Integer p-175879-6]
    (StructureNetherBridgePieces$Corridor/createPiece p-175879-0 p-175879-1 p-175879-2 p-175879-3 p-175879-4 p-175879-5 p-175879-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureNetherBridgePieces$Corridor this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$Corridor this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

