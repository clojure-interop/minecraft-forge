(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Crossing2
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Crossing2]))

(defn ->crossing-2
  "Constructor.

  p-i-45616-1 - `int`
  p-i-45616-2 - `java.util.Random`
  p-i-45616-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45616-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$Crossing2 [^Integer p-i-45616-1 ^java.util.Random p-i-45616-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45616-3 ^net.minecraft.util.EnumFacing p-i-45616-4]
    (new StructureNetherBridgePieces$Crossing2 p-i-45616-1 p-i-45616-2 p-i-45616-3 p-i-45616-4))
  (^StructureNetherBridgePieces$Crossing2 []
    (new StructureNetherBridgePieces$Crossing2 )))

(defn *create-piece
  "p-175878-0 - `java.util.List`
  p-175878-1 - `java.util.Random`
  p-175878-2 - `int`
  p-175878-3 - `int`
  p-175878-4 - `int`
  p-175878-5 - `net.minecraft.util.EnumFacing`
  p-175878-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$Crossing2`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$Crossing2 [^java.util.List p-175878-0 ^java.util.Random p-175878-1 ^Integer p-175878-2 ^Integer p-175878-3 ^Integer p-175878-4 ^net.minecraft.util.EnumFacing p-175878-5 ^Integer p-175878-6]
    (StructureNetherBridgePieces$Crossing2/createPiece p-175878-0 p-175878-1 p-175878-2 p-175878-3 p-175878-4 p-175878-5 p-175878-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureNetherBridgePieces$Crossing2 this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$Crossing2 this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

