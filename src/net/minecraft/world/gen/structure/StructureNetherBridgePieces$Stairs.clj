(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$Stairs
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$Stairs]))

(defn ->stairs
  "Constructor.

  p-i-45609-1 - `int`
  p-i-45609-2 - `java.util.Random`
  p-i-45609-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45609-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$Stairs [^Integer p-i-45609-1 ^java.util.Random p-i-45609-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45609-3 ^net.minecraft.util.EnumFacing p-i-45609-4]
    (new StructureNetherBridgePieces$Stairs p-i-45609-1 p-i-45609-2 p-i-45609-3 p-i-45609-4))
  (^StructureNetherBridgePieces$Stairs []
    (new StructureNetherBridgePieces$Stairs )))

(defn *create-piece
  "p-175872-0 - `java.util.List`
  p-175872-1 - `java.util.Random`
  p-175872-2 - `int`
  p-175872-3 - `int`
  p-175872-4 - `int`
  p-175872-5 - `int`
  p-175872-6 - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$Stairs`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$Stairs [^java.util.List p-175872-0 ^java.util.Random p-175872-1 ^Integer p-175872-2 ^Integer p-175872-3 ^Integer p-175872-4 ^Integer p-175872-5 ^net.minecraft.util.EnumFacing p-175872-6]
    (StructureNetherBridgePieces$Stairs/createPiece p-175872-0 p-175872-1 p-175872-2 p-175872-3 p-175872-4 p-175872-5 p-175872-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureNetherBridgePieces$Stairs this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$Stairs this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

