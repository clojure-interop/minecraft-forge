(ns net.minecraft.world.gen.structure.StructureVillagePieces$Path
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$Path]))

(defn ->path
  "Constructor.

  start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-i-45562-2 - `int`
  rand - `java.util.Random`
  p-i-45562-4 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  facing - `net.minecraft.util.EnumFacing`"
  (^StructureVillagePieces$Path [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^Integer p-i-45562-2 ^java.util.Random rand ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45562-4 ^net.minecraft.util.EnumFacing facing]
    (new StructureVillagePieces$Path start p-i-45562-2 rand p-i-45562-4 facing))
  (^StructureVillagePieces$Path []
    (new StructureVillagePieces$Path )))

(defn *find-piece-box
  "start - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  p-175848-1 - `java.util.List`
  rand - `java.util.Random`
  p-175848-3 - `int`
  p-175848-4 - `int`
  p-175848-5 - `int`
  facing - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.world.gen.structure.StructureBoundingBox`"
  (^net.minecraft.world.gen.structure.StructureBoundingBox [^net.minecraft.world.gen.structure.StructureVillagePieces$Start start ^java.util.List p-175848-1 ^java.util.Random rand ^Integer p-175848-3 ^Integer p-175848-4 ^Integer p-175848-5 ^net.minecraft.util.EnumFacing facing]
    (StructureVillagePieces$Path/findPieceBox start p-175848-1 rand p-175848-3 p-175848-4 p-175848-5 facing)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureVillagePieces$Path this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureVillagePieces$Path this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

