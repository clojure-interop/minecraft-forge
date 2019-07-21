(ns net.minecraft.world.gen.structure.StructureNetherBridgePieces$NetherStalkRoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureNetherBridgePieces$NetherStalkRoom]))

(defn ->nether-stalk-room
  "Constructor.

  p-i-45612-1 - `int`
  p-i-45612-2 - `java.util.Random`
  p-i-45612-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45612-4 - `net.minecraft.util.EnumFacing`"
  (^StructureNetherBridgePieces$NetherStalkRoom [^Integer p-i-45612-1 ^java.util.Random p-i-45612-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45612-3 ^net.minecraft.util.EnumFacing p-i-45612-4]
    (new StructureNetherBridgePieces$NetherStalkRoom p-i-45612-1 p-i-45612-2 p-i-45612-3 p-i-45612-4))
  (^StructureNetherBridgePieces$NetherStalkRoom []
    (new StructureNetherBridgePieces$NetherStalkRoom )))

(defn *create-piece
  "p-175875-0 - `java.util.List`
  p-175875-1 - `java.util.Random`
  p-175875-2 - `int`
  p-175875-3 - `int`
  p-175875-4 - `int`
  p-175875-5 - `net.minecraft.util.EnumFacing`
  p-175875-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureNetherBridgePieces$NetherStalkRoom`"
  (^net.minecraft.world.gen.structure.StructureNetherBridgePieces$NetherStalkRoom [^java.util.List p-175875-0 ^java.util.Random p-175875-1 ^Integer p-175875-2 ^Integer p-175875-3 ^Integer p-175875-4 ^net.minecraft.util.EnumFacing p-175875-5 ^Integer p-175875-6]
    (StructureNetherBridgePieces$NetherStalkRoom/createPiece p-175875-0 p-175875-1 p-175875-2 p-175875-3 p-175875-4 p-175875-5 p-175875-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureNetherBridgePieces$NetherStalkRoom this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureNetherBridgePieces$NetherStalkRoom this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

