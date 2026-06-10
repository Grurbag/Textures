// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelLichePriestHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmetOverlay;
	private final ModelRenderer snake;
	private final ModelRenderer helmetLeft;
	private final ModelRenderer helmetRight;
	private final ModelRenderer podborodok;
	private final ModelRenderer podborodok2;

	public WFMModelLichePriestHelmet() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmetOverlay = new ModelRenderer(this);
		helmetOverlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(helmetOverlay);
		helmetOverlay.cubeList.add(new ModelBox(helmetOverlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		snake = new ModelRenderer(this);
		snake.setRotationPoint(0.0F, -8.0F, -4.0F);
		helmetOverlay.addChild(snake);
		snake.cubeList.add(new ModelBox(snake, 0, 23, -4.5F, -9.5F, -0.5F, 9, 9, 0, 0.0F, false));

		helmetLeft = new ModelRenderer(this);
		helmetLeft.setRotationPoint(-8.0F, 1.0F, 4.0F);
		helmetOverlay.addChild(helmetLeft);
		helmetLeft.cubeList.add(new ModelBox(helmetLeft, 19, 20, -0.5F, -9.0F, -0.5F, 5, 12, 0, 0.0F, false));

		helmetRight = new ModelRenderer(this);
		helmetRight.setRotationPoint(4.0F, 1.0F, 4.0F);
		helmetOverlay.addChild(helmetRight);
		helmetRight.cubeList.add(new ModelBox(helmetRight, 30, 20, -0.5F, -9.0F, -0.5F, 5, 12, 0, 0.0F, false));

		podborodok = new ModelRenderer(this);
		podborodok.setRotationPoint(0.0F, 0.0F, -4.0F);
		helmetOverlay.addChild(podborodok);
		setRotationAngle(podborodok, -0.2618F, 0.0F, 0.0F);
		podborodok.cubeList.add(new ModelBox(podborodok, 46, 23, -2.5F, 0.0F, 0.0F, 5, 4, 0, 0.0F, false));

		podborodok2 = new ModelRenderer(this);
		podborodok2.setRotationPoint(0.0F, 4.0F, 0.0F);
		podborodok.addChild(podborodok2);
		setRotationAngle(podborodok2, -0.6981F, 0.0F, 0.0F);
		podborodok2.cubeList.add(new ModelBox(podborodok2, 46, 27, -2.5F, 0.0F, 0.0F, 5, 5, 0, 0.0F, false));
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