(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$End
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$End]))

(defn ->end
  "Constructor.

  p-i-45621-1 - `int`
  p-i-45621-2 - `java.util.Random`
  p-i-45621-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45621-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$End [^Integer p-i-45621-1 ^java.util.Random p-i-45621-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45621-3 ^net.minecraft.util.EnumFacing p-i-45621-4]
    (new StructureNetherBridgePieces$End p-i-45621-1 p-i-45621-2 p-i-45621-3 p-i-45621-4))
  (^StructureNetherBridgePieces$End []
    (new StructureNetherBridgePieces$End )))

(defn *create-piece
  "p-175884-0 - `java.util.List`
  p-175884-1 - `java.util.Random`
  p-175884-2 - `int`
  p-175884-3 - `int`
  p-175884-4 - `int`
  p-175884-5 - `net.minecraft.util.EnumFacing`
  p-175884-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$End`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$End [^java.util.List p-175884-0 ^java.util.Random p-175884-1 ^Integer p-175884-2 ^Integer p-175884-3 ^Integer p-175884-4 ^net.minecraft.util.EnumFacing p-175884-5 ^Integer p-175884-6]
    (StructureNetherBridgePieces$End/createPiece p-175884-0 p-175884-1 p-175884-2 p-175884-3 p-175884-4 p-175884-5 p-175884-6)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$End this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

