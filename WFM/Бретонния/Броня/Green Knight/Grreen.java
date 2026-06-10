// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Grreen extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmetOverlay;
	private final ModelRenderer mohawk;
	private final ModelRenderer mohawk2;
	private final ModelRenderer mohawk3;
	private final ModelRenderer mohawk5;
	private final ModelRenderer mohawk6;
	private final ModelRenderer bb_main;
	private final ModelRenderer shit_r1;

	public Grreen() {
		textureWidth = 128;
		textureHeight = 128;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 73, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		helmetOverlay = new ModelRenderer(this);
		helmetOverlay.setRotationPoint(9.0F, 0.0F, 0.0F);
		helmet.addChild(helmetOverlay);
		helmetOverlay.cubeList.add(new ModelBox(helmetOverlay, 106, 6, -14.5F, -10.5F, -4.1F, 11, 13, 0, 0.5F, false));

		mohawk = new ModelRenderer(this);
		mohawk.setRotationPoint(0.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk);
		mohawk.cubeList.add(new ModelBox(mohawk, 73, 28, 0.0F, -9.0F, 0.0F, 0, 20, 16, 0.0F, false));

		mohawk2 = new ModelRenderer(this);
		mohawk2.setRotationPoint(-1.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk2);
		setRotationAngle(mohawk2, 0.0F, 0.0436F, 0.0F);
		mohawk2.cubeList.add(new ModelBox(mohawk2, 73, 28, 0.5F, -9.0F, 0.0F, 0, 20, 16, 0.0F, false));

		mohawk3 = new ModelRenderer(this);
		mohawk3.setRotationPoint(1.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk3);
		mohawk3.cubeList.add(new ModelBox(mohawk3, 73, 28, -0.5F, -9.0F, 0.0F, 0, 20, 16, 0.0F, false));

		mohawk5 = new ModelRenderer(this);
		mohawk5.setRotationPoint(-1.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk5);
		setRotationAngle(mohawk5, 0.0F, 0.0873F, 0.0F);
		mohawk5.cubeList.add(new ModelBox(mohawk5, 73, 28, 0.0F, -9.0F, 0.0F, 0, 20, 16, 0.0F, false));

		mohawk6 = new ModelRenderer(this);
		mohawk6.setRotationPoint(2.0F, -10.0F, -3.0F);
		helmet.addChild(mohawk6);
		setRotationAngle(mohawk6, 0.0F, -0.0873F, 0.0F);
		mohawk6.cubeList.add(new ModelBox(mohawk6, 73, 28, -1.0F, -9.0F, 0.0F, 0, 20, 16, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 16, -0.1F, -12.0F, -2.0F, 4, 12, 4, 0.5F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 16, -3.9F, -12.0F, -2.0F, 4, 12, 4, 0.5F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 32, 0, -4.0F, -32.0F, -4.0F, 8, 8, 8, 0.5F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 16, -8.0F, -24.0F, -2.0F, 4, 12, 4, 0.5F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 16, 4.0F, -24.0F, -2.0F, 4, 12, 4, 0.5F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -32.0F, -4.0F, 8, 8, 8, 0.5F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 16, -4.0F, -24.0F, -2.0F, 8, 12, 4, 0.5F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 33, -4.0F, -24.0F, -2.0F, 8, 12, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 35, -3.9F, -12.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 35, -0.1F, -12.0F, -2.0F, 4, 12, 4, 0.0F, true));

		shit_r1 = new ModelRenderer(this);
		shit_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(shit_r1);
		setRotationAngle(shit_r1, 0.0F, -0.6545F, 0.0F);
		shit_r1.cubeList.add(new ModelBox(shit_r1, 0, 96, 10.0F, -33.0F, -8.0F, 32, 32, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}