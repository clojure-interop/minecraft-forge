(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Entrance
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Entrance]))

(defn ->entrance
  "Constructor.

  p-i-45617-1 - `int`
  p-i-45617-2 - `java.util.Random`
  p-i-45617-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45617-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$Entrance [^Integer p-i-45617-1 ^java.util.Random p-i-45617-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45617-3 ^net.minecraft.util.EnumFacing p-i-45617-4]
    (new StructureNetherBridgePieces$Entrance p-i-45617-1 p-i-45617-2 p-i-45617-3 p-i-45617-4))
  (^StructureNetherBridgePieces$Entrance []
    (new StructureNetherBridgePieces$Entrance )))

(defn *create-piece
  "p-175881-0 - `java.util.List`
  p-175881-1 - `java.util.Random`
  p-175881-2 - `int`
  p-175881-3 - `int`
  p-175881-4 - `int`
  p-175881-5 - `net.minecraft.util.EnumFacing`
  p-175881-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$Entrance`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$Entrance [^java.util.List p-175881-0 ^java.util.Random p-175881-1 ^Integer p-175881-2 ^Integer p-175881-3 ^Integer p-175881-4 ^net.minecraft.util.EnumFacing p-175881-5 ^Integer p-175881-6]
    (StructureNetherBridgePieces$Entrance/createPiece p-175881-0 p-175881-1 p-175881-2 p-175881-3 p-175881-4 p-175881-5 p-175881-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureNetherBridgePieces$Entrance this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$Entrance this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

