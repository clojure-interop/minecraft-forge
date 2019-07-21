(ns net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent
  "A special event used when the Mod.certificateFingerprint() doesn't match the certificate loaded from the JAR
  file. You could use this to log a warning that the code that is running might not be yours, for example."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLFingerprintViolationEvent]))

(defn ->fml-fingerprint-violation-event
  "Constructor.

  is-directory - `boolean`
  source - `java.io.File`
  fingerprints - `com.google.common.collect.ImmutableSet`
  expected-fingerprint - `java.lang.String`"
  (^FMLFingerprintViolationEvent [^Boolean is-directory ^java.io.File source ^com.google.common.collect.ImmutableSet fingerprints ^java.lang.String expected-fingerprint]
    (new FMLFingerprintViolationEvent is-directory source fingerprints expected-fingerprint)))

(defn directory?
  "returns: `boolean`"
  (^Boolean [^FMLFingerprintViolationEvent this]
    (-> this (.isDirectory))))

(defn get-fingerprints
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^FMLFingerprintViolationEvent this]
    (-> this (.getFingerprints))))

(defn get-source
  "returns: `java.io.File`"
  (^java.io.File [^FMLFingerprintViolationEvent this]
    (-> this (.getSource))))

(defn get-expected-fingerprint
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLFingerprintViolationEvent this]
    (-> this (.getExpectedFingerprint))))

