(ns net.minecraft.world.gen.structure.StructureVillagePieces$WoodHut
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$WoodHut]))

(defn ->wood-hut
  "Constructor.

  start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  type - `int`
  rand - `java.util.Random`
  structurebb - `net.minecraft.world.gen.structure.StructureBoundingBox`
  facing - `net.minecraft.util.EnumFacing`"
  (^StructureVillagePieces$WoodHut [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^Integer type ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox structurebb ^net.minecraft.util.EnumFacing facing]
    (new StructureVillagePieces$WoodHut start type rand structurebb facing))
  (^StructureVillagePieces$WoodHut []
    (new StructureVillagePieces$WoodHut )))

(defn *create-piece
  "start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-175853-1 - `java.util.List`
  rand - `java.util.Random`
  p-175853-3 - `int`
  p-175853-4 - `int`
  p-175853-5 - `int`
  facing - `net.minecraft.util.EnumFacing`
  p-175853-7 - `int`

  returns: `net.minecraft.world.gen.structure.StructureVillagePieces$WoodHut`"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$WoodHut [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^java.util.List p-175853-1 ^java.util.Random rand ^Integer p-175853-3 ^Integer p-175853-4 ^Integer p-175853-5 ^net.minecraft.util.EnumFacing facing ^Integer p-175853-7]
    (StructureVillagePieces$WoodHut/createPiece start p-175853-1 rand p-175853-3 p-175853-4 p-175853-5 facing p-175853-7)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureVillagePieces$WoodHut this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

