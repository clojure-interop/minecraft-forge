(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Crossing3
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Crossing3]))

(defn ->crossing-3
  "Constructor.

  p-i-45622-1 - `int`
  p-i-45622-2 - `java.util.Random`
  p-i-45622-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45622-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$Crossing3 [^Integer p-i-45622-1 ^java.util.Random p-i-45622-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45622-3 ^net.minecraft.util.EnumFacing p-i-45622-4]
    (new StructureNetherBridgePieces$Crossing3 p-i-45622-1 p-i-45622-2 p-i-45622-3 p-i-45622-4))
  (^StructureNetherBridgePieces$Crossing3 []
    (new StructureNetherBridgePieces$Crossing3 )))

(defn *create-piece
  "p-175885-0 - `java.util.List`
  p-175885-1 - `java.util.Random`
  p-175885-2 - `int`
  p-175885-3 - `int`
  p-175885-4 - `int`
  p-175885-5 - `net.minecraft.util.EnumFacing`
  p-175885-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$Crossing3`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$Crossing3 [^java.util.List p-175885-0 ^java.util.Random p-175885-1 ^Integer p-175885-2 ^Integer p-175885-3 ^Integer p-175885-4 ^net.minecraft.util.EnumFacing p-175885-5 ^Integer p-175885-6]
    (StructureNetherBridgePieces$Crossing3/createPiece p-175885-0 p-175885-1 p-175885-2 p-175885-3 p-175885-4 p-175885-5 p-175885-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureNetherBridgePieces$Crossing3 this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$Crossing3 this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

