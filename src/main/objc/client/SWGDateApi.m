#import "SWGDateApi.h"
#import "SWGFile.h"
#import "SWGApiClient.h"




@implementation SWGDateApi
static NSString * basePath = @"http://localhost:9000";

+(SWGDateApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {
    static SWGDateApi* singletonAPI = nil;

    if (singletonAPI == nil) {
        singletonAPI = [[SWGDateApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(void) setBasePath:(NSString*)path {
    basePath = path;
}

+(NSString*) getBasePath {
    return basePath;
}

-(SWGApiClient*) apiClient {
    return [SWGApiClient sharedClientFromPool:basePath];
}

-(void) addHeader:(NSString*)value forKey:(NSString*)key {
    [[self apiClient] setHeaderValue:value forKey:key];
}

-(id) init {
    self = [super init];
    [self apiClient];
    return self;
}

-(void) setHeaderValue:(NSString*) value
           forKey:(NSString*)key {
    [[self apiClient] setHeaderValue:value forKey:key];
}

-(unsigned long) requestQueueSize {
    return [SWGApiClient requestQueueSize];
}


-(NSNumber*) dtMonthWithCompletionBlock:(NSNumber*) serialNumber
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{serialNumber}/month", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"serialNumber", @"}"]] withString: [SWGApiClient escape:serialNumber]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(serialNumber == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dtYearWithCompletionBlock:(NSNumber*) serialNumber
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{serialNumber}/year", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"serialNumber", @"}"]] withString: [SWGApiClient escape:serialNumber]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(serialNumber == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) isLeapYearWithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/today/isLeapYear", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dtstrIsLeapYear WithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{mm}/{dd}/{yyyy}/isLeapYear", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) monthWithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/today/month", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) simpleFmtWithCompletionBlock:(NSNumber*) serialNumber
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{serialNumber}/mmddyyyy", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"serialNumber", @"}"]] withString: [SWGApiClient escape:serialNumber]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(serialNumber == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dtstrMonthWithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{mm}/{dd}/{yyyy}/month", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dtstrDayOfMonthWithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{mm}/{dd}/{yyyy}/dayOfMonth", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dtIsLeapYearWithCompletionBlock:(NSNumber*) serialNumber
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{serialNumber}/isLeapYear", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"serialNumber", @"}"]] withString: [SWGApiClient escape:serialNumber]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(serialNumber == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dayOfYearWithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/today/dayOfYear", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) todaySimpleFmtWithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/today/mmddyyyy", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dtstrDayOfYear WithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{mm}/{dd}/{yyyy}/dayOfYear", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) weekdayWithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/today/weekday", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dtstrWeekdayWithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{mm}/{dd}/{yyyy}/weekday", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dtstrYearWithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{mm}/{dd}/{yyyy}/year", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dayOfMonthWithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/today/dayOfMonth", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) yearWithCompletionBlock: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/today/year", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dtDayOfYear WithCompletionBlock:(NSNumber*) serialNumber
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{serialNumber}/dayOfYear", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"serialNumber", @"}"]] withString: [SWGApiClient escape:serialNumber]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(serialNumber == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dtDayOfMonthWithCompletionBlock:(NSNumber*) serialNumber
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{serialNumber}/dayOfMonth", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"serialNumber", @"}"]] withString: [SWGApiClient escape:serialNumber]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(serialNumber == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) todayWithCompletionBlock: (void (^)(NSNumber* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/today/serialNumber", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSNumber *result = data ? [[NSNumber alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}

-(NSNumber*) dtWeekdayWithCompletionBlock:(NSNumber*) serialNumber
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock{

    NSMutableString* requestUrl = [NSMutableString stringWithFormat:@"%@/date/{serialNumber}/weekday", basePath];

    // remove format in URL if needed
    if ([requestUrl rangeOfString:@".{format}"].location != NSNotFound)
        [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:@".{format}"] withString:@".json"];

    [requestUrl replaceCharactersInRange: [requestUrl rangeOfString:[NSString stringWithFormat:@"%@%@%@", @"{", @"serialNumber", @"}"]] withString: [SWGApiClient escape:serialNumber]];
    NSString* requestContentType = @"application/json";
    NSString* responseContentType = @"application/json";

        NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [[NSMutableDictionary alloc] init];
    id bodyDictionary = nil;
        if(serialNumber == nil) {
        // error
    }
    SWGApiClient* client = [SWGApiClient sharedClientFromPool:basePath];

    return [client stringWithCompletionBlock:requestUrl 
                                              method:@"GET" 
                                         queryParams:queryParams 
                                                body:bodyDictionary 
                                        headerParams:headerParams
                                  requestContentType: requestContentType
                                 responseContentType: responseContentType
                                     completionBlock:^(NSString *data, NSError *error) {
                         if (error) {
                             completionBlock(nil, error);
                             return;
                         }
                        NSString *result = data ? [[NSString alloc]initWithString: data] : nil;
                        completionBlock(result, nil);
                     }];
    

}



@end
