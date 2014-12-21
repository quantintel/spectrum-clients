#import <Foundation/Foundation.h>
#import "SWGObject.h"


@interface SWGSingleStringValue : SWGObject

@property(nonatomic) NSString* value;  

- (id) value: (NSString*) value;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

