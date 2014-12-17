#import <Foundation/Foundation.h>
#import "SWGObject.h"


@interface SWGMemory : SWGObject

@property(nonatomic) NSNumber* allocated;  

@property(nonatomic) NSNumber* max;  

@property(nonatomic) NSNumber* free;  

@property(nonatomic) NSNumber* used;  

@property(nonatomic) NSNumber* percentUsed;  

- (id) allocated: (NSNumber*) allocated
     max: (NSNumber*) max
     free: (NSNumber*) free
     used: (NSNumber*) used
     percentUsed: (NSNumber*) percentUsed;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

