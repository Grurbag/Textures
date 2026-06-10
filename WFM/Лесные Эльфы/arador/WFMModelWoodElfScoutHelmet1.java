// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelWoodElfScoutHelmet1 extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer bipedHeadware;
	private final ModelRenderer helmet_1;
	private final ModelRenderer helmet_2;
	private final ModelRenderer helmet_3;

	public WFMModelWoodElfScoutHelmet1() {
		textureWidth = 64;
		textureHeight = 32;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.6F, false));

		bipedHeadware = new ModelRenderer(this);
		bipedHeadware.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(bipedHeadware);
		bipedHeadware.cubeList.add(new ModelBox(bipedHeadware, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F, false));

		helmet_1 = new ModelRenderer(this);
		helmet_1.setRotationPoint(0.0F, -9.0F, -5.0F);
		bipedHeadware.addChild(helmet_1);
		setRotationAngle(helmet_1, 0.9163F, 0.0F, 0.0F);
		helmet_1.cubeList.add(new ModelBox(helmet_1, -9, 23, -6.5F, 0.0F, 0.0F, 13, 0, 9, 0.0F, false));

		helmet_2 = new ModelRenderer(this);
		helmet_2.setRotationPoint(5.0F, -9.0F, -5.0F);
		bipedHeadware.addChild(helmet_2);
		setRotationAngle(helmet_2, 0.0F, -0.8727F, 0.0F);
		helmet_2.cubeList.add(new ModelBox(helmet_2, 42, 23, 0.0F, 0.0F, 0.0F, 8, 9, 0, 0.0F, false));

		helmet_3 = new ModelRenderer(this);
		helmet_3.setRotationPoint(-5.0F, -9.0F, -5.0F);
		bipedHeadware.addChild(helmet_3);
		setRotationAngle(helmet_3, 0.0F, 0.8727F, 0.0F);
		helmet_3.cubeList.add(new ModelBox(helmet_3, 26, 23, -8.0F, 0.0F, 0.0F, 8, 9, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedHead.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}