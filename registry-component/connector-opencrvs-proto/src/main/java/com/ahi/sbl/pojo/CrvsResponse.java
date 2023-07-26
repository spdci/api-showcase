package com.ahi.sbl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrvsResponse {

    private CrvsData data;
    private List<Error> errors;
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CrvsData {
        private SearchEvents searchEvents;
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        public static class SearchEvents {
            private int totalItems;
            private List<EventResult> results;
            @Data
            @NoArgsConstructor
            @AllArgsConstructor
            public static class EventResult {
                private String type;
                private Registration registration;
                private String childGender;
                private String dateOfBirth;
                private String dateOfMarriage;
                private List<Name> childName;
                private List<Name> brideName;
                private String brideIdentifier;
                private List<Name> groomName;
                private String groomIdentifier;

                private List<Name> deceasedName;
                private String dateOfDeath;
                @Data
                @NoArgsConstructor
                @AllArgsConstructor
                public static class Registration {
                    private String registrationNumber;
                    private String eventLocationId;
                    private String registeredLocationId;
                    private String createdAt;
                }
                @Data
                @NoArgsConstructor
                @AllArgsConstructor
                public static class Name {
                    private String firstNames;
                    private String familyName;
                    private String use;
                }
            }
        }
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Error {
        private String message;
        private List<Location> locations;
        private List<String> path;
        private Extensions extensions;

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Location {
            private int line;
            private int column;
        }

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Extensions {
            private String code;
        }
    }
}
