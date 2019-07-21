(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor4
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Corridor4]))

(defn ->corridor-4
  "Constructor.

  p-i-45618-1 - `int`
  p-i-45618-2 - `java.util.Random`
  p-i-45618-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45618-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$Corridor4 [^Integer p-i-45618-1 ^java.util.Random p-i-45618-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45618-3 ^net.minecraft.util.EnumFacing p-i-45618-4]
    (new StructureNetherBridgePieces$Corridor4 p-i-45618-1 p-i-45618-2 p-i-45618-3 p-i-45618-4))
  (^StructureNetherBridgePieces$Corridor4 []
    (new StructureNetherBridgePieces$Corridor4 )))

(defn *create-piece
  "p-175880-0 - `java.util.List`
  p-175880-1 - `java.util.Random`
  p-175880-2 - `int`
  p-175880-3 - `int`
  p-175880-4 - `int`
  p-175880-5 - `net.minecraft.util.EnumFacing`
  p-175880-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor4`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$Corridor4 [^java.util.List p-175880-0 ^java.util.Random p-175880-1 ^Integer p-175880-2 ^Integer p-175880-3 ^Integer p-175880-4 ^net.minecraft.util.EnumFacing p-175880-5 ^Integer p-175880-6]
    (StructureNetherBridgePieces$Corridor4/createPiece p-175880-0 p-175880-1 p-175880-2 p-175880-3 p-175880-4 p-175880-5 p-175880-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureNetherBridgePieces$Corridor4 this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$Corridor4 this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

