(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Throne
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Throne]))

(defn ->throne
  "Constructor.

  p-i-45611-1 - `int`
  p-i-45611-2 - `java.util.Random`
  p-i-45611-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45611-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$Throne [^Integer p-i-45611-1 ^java.util.Random p-i-45611-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45611-3 ^net.minecraft.util.EnumFacing p-i-45611-4]
    (new StructureNetherBridgePieces$Throne p-i-45611-1 p-i-45611-2 p-i-45611-3 p-i-45611-4))
  (^StructureNetherBridgePieces$Throne []
    (new StructureNetherBridgePieces$Throne )))

(defn *create-piece
  "p-175874-0 - `java.util.List`
  p-175874-1 - `java.util.Random`
  p-175874-2 - `int`
  p-175874-3 - `int`
  p-175874-4 - `int`
  p-175874-5 - `int`
  p-175874-6 - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$Throne`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$Throne [^java.util.List p-175874-0 ^java.util.Random p-175874-1 ^Integer p-175874-2 ^Integer p-175874-3 ^Integer p-175874-4 ^Integer p-175874-5 ^net.minecraft.util.EnumFacing p-175874-6]
    (StructureNetherBridgePieces$Throne/createPiece p-175874-0 p-175874-1 p-175874-2 p-175874-3 p-175874-4 p-175874-5 p-175874-6)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$Throne this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

