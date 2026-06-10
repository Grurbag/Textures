// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelGreenKnightHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmetOverlay;
	private final ModelRenderer mohawk;
	private final ModelRenderer mohawk2;
	private final ModelRenderer mohawk3;
	private final ModelRenderer mohawk5;
	private final ModelRenderer mohawk6;

	public WFMModelGreenKnightHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 24.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		helmetOverlay = new ModelRenderer(this);
		helmetOverlay.setRotationPoint(9.0F, 0.0F, 0.0F);
		helmet.addChild(helmetOverlay);
		helmetOverlay.cubeList.add(new ModelBox(helmetOverlay, 33, 6, -14.5F, -10.5F, -4.1F, 11, 13, 0, 0.5F, false));

		mohawk = new ModelRenderer(this);
		mohawk.setRotationPoint(0.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk);
		mohawk.cubeList.add(new ModelBox(mohawk, 0, 28, 0.0F, -9.0F, 0.0F, 0, 20, 16, 0.0F, false));

		mohawk2 = new ModelRenderer(this);
		mohawk2.setRotationPoint(-1.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk2);
		setRotationAngle(mohawk2, 0.0F, 0.0436F, 0.0F);
		mohawk2.cubeList.add(new ModelBox(mohawk2, 0, 28, 0.5F, -9.0F, 0.0F, 0, 20, 16, 0.0F, false));

		mohawk3 = new ModelRenderer(this);
		mohawk3.setRotationPoint(1.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk3);
		mohawk3.cubeList.add(new ModelBox(mohawk3, 0, 28, -0.5F, -9.0F, 0.0F, 0, 20, 16, 0.0F, false));

		mohawk5 = new ModelRenderer(this);
		mohawk5.setRotationPoint(-1.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk5);
		setRotationAngle(mohawk5, 0.0F, 0.0873F, 0.0F);
		mohawk5.cubeList.add(new ModelBox(mohawk5, 0, 28, 0.0F, -9.0F, 0.0F, 0, 20, 16, 0.0F, false));

		mohawk6 = new ModelRenderer(this);
		mohawk6.setRotationPoint(2.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk6);
		setRotationAngle(mohawk6, 0.0F, -0.0873F, 0.0F);
		mohawk6.cubeList.add(new ModelBox(mohawk6, 0, 28, -1.0F, -9.0F, 0.0F, 0, 20, 16, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}