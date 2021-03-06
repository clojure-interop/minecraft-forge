(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Crossing
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Crossing]))

(defn ->crossing
  "Constructor.

  p-i-45610-1 - `int`
  p-i-45610-2 - `java.util.Random`
  p-i-45610-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45610-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$Crossing [^Integer p-i-45610-1 ^java.util.Random p-i-45610-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45610-3 ^net.minecraft.util.EnumFacing p-i-45610-4]
    (new StructureNetherBridgePieces$Crossing p-i-45610-1 p-i-45610-2 p-i-45610-3 p-i-45610-4))
  (^StructureNetherBridgePieces$Crossing []
    (new StructureNetherBridgePieces$Crossing )))

(defn *create-piece
  "p-175873-0 - `java.util.List`
  p-175873-1 - `java.util.Random`
  p-175873-2 - `int`
  p-175873-3 - `int`
  p-175873-4 - `int`
  p-175873-5 - `net.minecraft.util.EnumFacing`
  p-175873-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$Crossing`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$Crossing [^java.util.List p-175873-0 ^java.util.Random p-175873-1 ^Integer p-175873-2 ^Integer p-175873-3 ^Integer p-175873-4 ^net.minecraft.util.EnumFacing p-175873-5 ^Integer p-175873-6]
    (StructureNetherBridgePieces$Crossing/createPiece p-175873-0 p-175873-1 p-175873-2 p-175873-3 p-175873-4 p-175873-5 p-175873-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureNetherBridgePieces$Crossing this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$Crossing this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

