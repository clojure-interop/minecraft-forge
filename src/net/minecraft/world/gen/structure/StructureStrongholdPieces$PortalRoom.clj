(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$PortalRoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$PortalRoom]))

(defn ->portal-room
  "Constructor.

  p-i-45577-1 - `int`
  p-i-45577-2 - `java.util.Random`
  p-i-45577-3 - `net.minecraft.world.gen.structure.StructureBoundingBox`
  p-i-45577-4 - `net.minecraft.util.EnumFacing`"
  (^StructureStrongholdPieces$PortalRoom [^Integer p-i-45577-1 ^java.util.Random p-i-45577-2 ^net.minecraft.world.gen.structure.StructureBoundingBox p-i-45577-3 ^net.minecraft.util.EnumFacing p-i-45577-4]
    (new StructureStrongholdPieces$PortalRoom p-i-45577-1 p-i-45577-2 p-i-45577-3 p-i-45577-4))
  (^StructureStrongholdPieces$PortalRoom []
    (new StructureStrongholdPieces$PortalRoom )))

(defn *create-piece
  "p-175865-0 - `java.util.List`
  p-175865-1 - `java.util.Random`
  p-175865-2 - `int`
  p-175865-3 - `int`
  p-175865-4 - `int`
  p-175865-5 - `net.minecraft.util.EnumFacing`
  p-175865-6 - `int`

  returns: `net.minecraft.world.gen.structure.StructureStrongholdPieces$PortalRoom`"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$PortalRoom [^java.util.List p-175865-0 ^java.util.Random p-175865-1 ^Integer p-175865-2 ^Integer p-175865-3 ^Integer p-175865-4 ^net.minecraft.util.EnumFacing p-175865-5 ^Integer p-175865-6]
    (StructureStrongholdPieces$PortalRoom/createPiece p-175865-0 p-175865-1 p-175865-2 p-175865-3 p-175865-4 p-175865-5 p-175865-6)))

(defn build-component
  "component-in - `net.minecraft.world.gen.structure.StructureComponent`
  list-in - `java.util.List`
  rand - `java.util.Random`"
  ([^StructureStrongholdPieces$PortalRoom this ^net.minecraft.world.gen.structure.StructureComponent component-in ^java.util.List list-in ^java.util.Random rand]
    (-> this (.buildComponent component-in list-in rand))))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureStrongholdPieces$PortalRoom this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

