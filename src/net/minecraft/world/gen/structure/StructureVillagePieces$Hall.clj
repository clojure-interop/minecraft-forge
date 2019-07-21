(ns net.minecraft.world.gen.structure.StructureVillagePieces$Hall
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$Hall]))

(defn ->hall
  "Constructor.

  start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  type - `int`
  rand - `java.util.Random`
  p-i-45567-4 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  facing - `net.minecraft.util.EnumFacing`"
  (^StructureVillagePieces$Hall [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^Integer type ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45567-4 ^net.minecraft.util.EnumFacing facing]
    (new StructureVillagePieces$Hall start type rand p-i-45567-4 facing))
  (^StructureVillagePieces$Hall []
    (new StructureVillagePieces$Hall )))

(defn *create-piece
  "start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-175857-1 - `java.util.List`
  rand - `java.util.Random`
  p-175857-3 - `int`
  p-175857-4 - `int`
  p-175857-5 - `int`
  facing - `net.minecraft.util.EnumFacing`
  p-175857-7 - `int`

  returns: `net.minecraft.world.gen.structure.StructureVillagePieces$Hall`"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$Hall [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^java.util.List p-175857-1 ^java.util.Random rand ^Integer p-175857-3 ^Integer p-175857-4 ^Integer p-175857-5 ^net.minecraft.util.EnumFacing facing ^Integer p-175857-7]
    (StructureVillagePieces$Hall/createPiece start p-175857-1 rand p-175857-3 p-175857-4 p-175857-5 facing p-175857-7)))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureVillagePieces$Hall this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

